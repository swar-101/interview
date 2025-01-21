# MRO

In when, when a method is called on an object, Python will follow the **Method Resolution Order (MRO)** to determine
which method to invoke. 

This is especially important in **Multiple Inheritance** scenarios. Python internally uses **C3 linearization**
algorithm to resolve the order.

Q. How do we infer this order? Is it really necessary? Is multiple inheritance usually practiced in Software Engineering?

