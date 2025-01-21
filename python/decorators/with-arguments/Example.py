# Declaration

def repeat_decorator(times):
    def decorator(func):
        def wrapper(*args,**kwargs):
            for _ in range(times):
                func(*args, **kwargs)
        return wrapper
    return decorator

# Uses

# Example 1

@repeat_decorator(3)
def greet(name):
    print(f"Hi, {name}!")


greet("Esmeralda")
greet("Diego")
greet("Swar")


# Example 2

@repeat_decorator(2)
def sands_of_time(a, b):
    if a == "kryptonite" and b== "superman":
        return print("I'm sorry, Superman.")
    if a == "joker" and b == "gotham":
        return print("Bye Joker, I'm here, Batman.")
    else:
        return print("Quack quack.")


sands_of_time("joker", "gotham")