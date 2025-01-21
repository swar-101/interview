1. The `ABC` class in the `abc` module is used to define an abstract class.
2. The `@abstractmethod` decorator is used to define abstract methods that must be implemented in subclasses.
3. Abstract classes cannot be instantiated directly. Attempting to do so raises a `TypeError`. 
4. Abstract VS Concrete methods

| **Type**              | **Definition**                                                                                  | **Requirement**                                                                 |
|-----------------------|------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------|
| **Abstract Method**   | Defined in the base class using the `@abstractmethod` decorator.                               | Subclasses **must** override these methods.                                    |
| **Concrete Method**   | Defined normally in the base class.                                                            | Subclasses can use it as-is or override it if needed.                          | 
