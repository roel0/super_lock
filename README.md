Created this shared library, due lack of suport on jenkins for locking multiple resources at once

Example:


```
super_lock(["lock1","lock2"])
{ 
    echo "I'm super locked!" 
}
```
