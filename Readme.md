# Multi-Feature Snakes🐍 and Ladders🪜 Game (LLD)

A robust, object-oriented, console-based implementation of the classic **Snakes and Ladders** board game written in Java. This project serves as a showcase for Low-Level Design (LLD) best practices, utilizing SOLID principles, clean separation of concerns, and classic structural design patterns.

---

## 🚀 Features

* **Dynamic Board Configuration:** Supports customizable grid sizes (automatically rendered using a snake-like Boustrophedon layout matrix).
* **Custom Game Assets:** Configure any number of snakes, ladders, and players right from the console.
* **Multi-Dice Support:** Choose how many dice players roll per turn (e.g., playing with 1, 2, or more dice simultaneously).
* **Fair Turn Rotation:** Implements a stable queue-based FIFO orchestration system ensuring flawless rotational gameplay.
* **Detailed Console Board State:** Generates a real-time textual ASCII matrix showing precisely where players, snakes (🐍), and ladders (🪜) are positioned at the end of every turn.

---

## 🛠️ Tech Stack & Design Architecture

* **Language:** Java 17+
* **Build Tool:** Maven
* **Boilerplate Management:** Project Lombok (`@Getter`, `@Setter`, `@RequiredArgsConstructor`)

### Core Design Patterns Implemented

1.  **Factory Design Pattern (`ObstacleFactory`):** Centralizes the creation logic of board hazards. Decouples the primary game engine from concrete subclasses (`Snake`, `Ladder`), streamlining future expansions (e.g., adding teleporters).
2.  **Polymorphism / Inheritance:** Leverages an abstract `Obstacle` core class allowing uniform positional calculations for disparate board traps.
3.  **Encapsulation:** Grid coordinates map internally to a complex 2D matrix layout, while exposing clean 1D positions (`1` to `N`) to the external user interface layers.

---

## 📦 Project Structure

```text
src/main/java/com/pky/snakesandladders
│
├── enums/
│   └── ObstacleType.java         # Enum separating SNAKE and LADDER variants
│
├── factory/
│   └── ObstacleFactory.java      # Factory generating dynamic board obstacles
│
├── model/
│   ├── Board.java                # Row/Col coordinate mapping and placement validation
│   ├── Cell.java                 # Individual board tiles containing hazards
│   ├── Dice.java                 # Handles rolling of multi-dice components
│   ├── Player.java               # State tracking of names and positions
│   ├── Obstacle.java             # Abstract blueprint for hazards
│   ├── Snake.java                # Concrete hazard reducing player position
│   └── Ladder.java               # Concrete hazard boosting player position
│
├── service/
│   └── Game.java                 # Core orchestrator managing the primary game loop
│
└── Main.java                     # Application entry point (Console Interface)