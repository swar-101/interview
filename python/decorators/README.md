A decorator in Python is a function that modifies or extends the behaviour of another function or method without
permanently modifying its source code. Decorators are often used for 
- logging, 
- enforcing access control, 
- instrumentation 
- memoization, 
- and other cross-cutting concerns.

Decorators wrap a function, providing additional functionality before or after the function they decorate is executed.
They are applied using the `@name_of_the_decorator` syntax above the function.

```python
from some_library import some_db


def store(args):
    def wrapper(*args, **kwargs):
        some_db.store(args)
        result = func(*args, **kwargs)
        some_db.store(result)
        return result

    return wrapper


# The decorator @store enables calculate() to store result in some_db

@store
def calculate(a, b):
    return a + b
```

This example uses a store decorator to save the arguments of the calculate function into a database
(some_db.store(args)) every time the function is called. 
It helps keep a record of the inputs automatically.