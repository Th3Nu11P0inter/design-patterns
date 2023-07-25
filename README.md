# The only 5 design patterns you will need in 90% of your work, and 1 you should avoid.

1. Factory Method Pattern: Provides an interface for creating objects, but allows subclasses to decide which class to instantiate.
2. Builder Pattern: Separates the construction of complex objects from their representation, allowing the same construction process to create different representations.
3. Facade Pattern: Provides a simplified interface to a larger body of code, making it easier to use and understand.
4. Decorator Pattern: Adds additional functionality to objects dynamically without modifying their structure.
5. Strategy Pattern: Enables interchangeable algorithms or behaviors to be selected dynamically during runtime.

## Misused pattern

Singleton Pattern: Ensures a class has only one instance and provides a global point of access to that instance.

#### alternative...

Dependency Injection: promotes loose coupling and enhances maintainability in your codebase. By doing so, you achieve greater flexibility, testability, and reusability in your code. 