def call(lock_names, body) {
    def prev = body
    for(lock_name in lock_names) {
        prev = _lock(lock_name, prev)
    }
    prev()
}

def _lock(lock_name, body) {
    return {
        lock(inversePrecedence: true, quantity: 1, resource: lock_name) {
            body()
        }
    }
}
