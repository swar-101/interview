def simple_decorator(func):
    def wrapper():
        print(f"Executing {func.__name__}...")
        result = func()
        print(f"{func.__name__} executed.")
        return result
    return wrapper

@simple_decorator
def say_hello():
    print("Hello, World!")

say_hello()