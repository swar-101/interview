# Q. Write a decorator that checks whether a user has the required role or permission to access a function.
# A:

def requires_role(role):
    def decorator(func):
        def wrapper(*args, **kwargs):
            user_role = kwargs.get("user_role")
            if user_role != role:
                raise PermissionError(f"User must have the '{role}' role.")
            return func(*args, **kwargs)
        return wrapper
    return decorator


# Doubt: Why does this decorator need an extra wrapping?
# can I name nested wrapper functions any name I want?
