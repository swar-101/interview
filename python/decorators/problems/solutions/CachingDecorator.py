# Q. Write a decorator that implements memoization/caching for a function to store previously computed results.

# A:

def memoize(func):
    cache = {}  # declare an empty dictionary

    def wrapper(*args):
        if args in cache:
            print("Fetching memoized value.")       
            return cache[args]  # return if already cached
        result = func(*args)
        cache[args] = result  # doubt: Does this mean that we store result or overwrite the result for the particular env
        return result

    return wrapper


# f0       default            0             = 0
# f1       default            1             = 1
# f2       f0 + f1            0 + 1         = 1
# f3       f1 + f2            1 + 1         = 2
# f4       f2 + f3            1 + 2         = 3
# f5       f3 + f4            2 + 3         = 5

# Pattern
# fn      f(n-1) + f(n+1)

@memoize
def fibonacci(n):
    if n == 0 or n == 1:
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)


print(fibonacci(3))
print(fibonacci(5))
print(fibonacci(35)) # Stuff gets memoized as n gets larger