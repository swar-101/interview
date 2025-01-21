1. Dynamic Dispatch:
   Method overriding is resolved at runtime, not at compile time.
   This is a key feature of polymorphism.

2. Parent Method Access:
   The `super()` function can be used to access the parent class's implementation
   of the method.

3. Differences from Overloading:
   Python doesn't support method overloading (methods with the same name but
   different signatures). Therefore, method overriding is the primary way to
   customize method behaviour.

4. Customization:
    Overriding is often used in frameworks and libraries where base classes provide default behaviors, and child 
    classes customize them.