# Q. Write a decorator that checks whether a user has the required role or permission to access a function.
# A:
from urllib.parse import uses_query


def requires_role(role): # Acts as a factory that accepts role
    def role_checker(func): # Actual decorator that wraps the target function
        def role_verifier(*args, **kwargs): # Wrapper function wraps the execution of the target function
            user_role = kwargs.get("user_role")
            if user_role != role:
                raise PermissionError(f"User must have the '{role}' role.")
            return func(*args, **kwargs)
        return role_verifier
    return role_checker


# Doubt: Why does this decorator need an extra wrapping?
# can I name nested wrapper functions any name I want?

@requires_role("admin")
def access_admin_panel(*args, **kwargs):
    return "Access granted to the admin panel"

try:
    print(access_admin_panel(user_role="admin"))
    print(access_admin_panel(user_role="user"))
except PermissionError as e:
    print(e)


