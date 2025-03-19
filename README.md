# Java Design Patterns

This repository provides implementations and explanations of various design patterns in Java. Design patterns are proven solutions to common problems in software design, serving as templates that can be adapted to different situations.

## Table of Contents

- [Introduction](#introduction)
- [Design Patterns Covered](#design-patterns-covered)
  - [Creational Patterns](#creational-patterns)
  - [Structural Patterns](#structural-patterns)
  - [Behavioral Patterns](#behavioral-patterns)
- [How to Use This Repository](#how-to-use-this-repository)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Design patterns are categorized into three main types:

1. **Creational Patterns**: Deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.
2. **Structural Patterns**: Concerned with object composition, forming larger structures from individual objects and classes.
3. **Behavioral Patterns**: Focus on communication between objects, ensuring system behaviors are flexible and scalable.

## Design Patterns Covered

### Creational Patterns

- **Factory Method**: Provides an interface for creating objects but allows subclasses to alter the type of objects that will be created.
- **Abstract Factory**: Offers an interface for creating families of related or dependent objects without specifying their concrete classes.
- **Builder**: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
- **Prototype**: Specifies the kind of objects to create using a prototypical instance and creates new objects by copying this prototype.
- **Singleton**: Ensures a class has only one instance and provides a global point of access to it.

### Structural Patterns

- **Adapter**: Allows incompatible interfaces to work together by acting as a bridge between them.
- **Bridge**: Separates an object's abstraction from its implementation, allowing the two to vary independently.
- **Composite**: Composes objects into tree structures to represent part-whole hierarchies, letting clients treat individual objects and compositions uniformly.
- **Decorator**: Adds additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.
- **Facade**: Provides a unified interface to a set of interfaces in a subsystem, making it easier to use.
- **Flyweight**: Uses sharing to support large numbers of fine-grained objects efficiently.
- **Proxy**: Provides a surrogate or placeholder for another object to control access to it.

### Behavioral Patterns

- **Chain of Responsibility**: Passes a request along a chain of handlers, allowing each handler to process the request or pass it along the chain.
- **Command**: Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.
- **Interpreter**: Defines a grammatical representation for a language and an interpreter to interpret the grammar.
- **Iterator**: Provides a way to access elements of a collection sequentially without exposing its underlying representation.
- **Mediator**: Defines an object that encapsulates how a set of objects interact, promoting loose coupling.
- **Memento**: Captures and externalizes an object's internal state without violating encapsulation, allowing the object to be restored to this state later.
- **Observer**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- **State**: Allows an object to alter its behavior when its internal state changes, appearing to change its class.
- **Strategy**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
- **Template Method**: Defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
- **Visitor**: Represents an operation to be performed on elements of an object structure, allowing new operations to be defined without changing the classes of the elements.

## How to Use This Repository

Each design pattern is implemented in its respective directory, containing:

- A **README.md** file explaining the pattern.
- Java source code demonstrating the pattern's implementation.
- Unit tests (if applicable) to illustrate usage.

To explore a specific pattern:

1. Navigate to the pattern's directory.
2. Read the `README.md` for an overview.
3. Review the Java implementation files.
4. Run the provided examples or tests to see the pattern in action.

## Contributing

Contributions are welcome! If you'd like to add a new pattern, improve existing implementations, or fix issues:

1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes with clear messages.
4. Push your branch and open a pull request.

Please ensure your code adheres to standard Java conventions and includes appropriate documentation and tests.

## License

This repository is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
