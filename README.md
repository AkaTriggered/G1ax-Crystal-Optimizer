# G1ax Crystal Optimizer

A lightweight client-side Fabric mod that improves Crystal PvP responsiveness by reducing client-side placement and break delay.

The mod focuses on making crystal interactions feel smoother while remaining configurable for different servers and play styles.

---

## Features

- Faster crystal placement
- Faster crystal breaking
- Reduced visual delay
- Client-side crystal prediction
- Adaptive optimization based on latency
- Multiple optimization modes
- Client-side only
- Multiplayer compatible

---

## Comparison

| Optimized | Vanilla |
| --- | --- |
| <img src="https://cdn.modrinth.com/data/Xqnzyc08/images/7767bacd211b1067e496cee460a32039e95a3b0f.gif" width="360"> | <img src="https://cdn.modrinth.com/data/Xqnzyc08/images/d9e6880b21ff5314f430337592de27b417fd1a0c.gif" width="360"> |

---

## Modes

### default

The recommended mode.

Provides full client-side optimization including crystal prediction and adaptive packet scheduling for the smoothest experience.

### tweak

A vanilla-friendly mode that removes only the client-side placement cooldown while keeping behavior close to vanilla.

Useful for servers with stricter anticheat.

### off

Disables every optimization and restores vanilla behavior.

---

## Commands

```text
/g1axoptimizer default
/g1axoptimizer tweak
/g1axoptimizer off
```

---

## Requirements

- Minecraft 1.21.1+
- Fabric Loader
- Fabric API
- Java 21

---

## Building

```bash
git clone https://github.com/tech-anupam/G1ax-Crystal-Optimizer.git
cd G1ax-Crystal-Optimizer
./gradlew build
```

The compiled JAR will be generated in:

```text
build/libs/
```

---

## Repository

```
src/
 ├── command/
 ├── listener/
 ├── mixin/
 ├── optimizer/
 ├── packets/
 └── util/
```

---

## License

This project is released under the CC0 1.0 Universal license.

---

Issues and feature requests are welcome through GitHub Issues.
