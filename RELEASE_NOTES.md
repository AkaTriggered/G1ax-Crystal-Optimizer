# 🔮 G1ax Crystal Optimizer Release Notes

## 🚀 Version 1.0.4

### Bug Fixes

#### [Issue 7] Command Output Colors Not Rendering
- Fixed all `§` color codes in chat messages being silently ignored.
- Root cause: `MutableText.formatted()` is non-mutating — the returned styled text was discarded, causing every color, bold, and italic code to fall back to plain white.
- All command output (`/g1axoptimizer default`, `tweak`, `off`, status) now renders with correct gold, green, red, yellow, and gray formatting.

### New Features

#### [Issue 8] Modrinth Auto Update Checker
- Added `UpdateChecker.java` — a lightweight background update checker powered by the public Modrinth API (no API key required).
- On mod load, a daemon thread silently fetches the latest published version from `api.modrinth.com`.
- The first tick the player enters a world, if a newer version is available, a single beautifully formatted notification is displayed in chat with the download link and custom dev contact.
- Shows **once per session only** — no spam.
- If already on the latest version, completely silent.

---

## 🚀 Version 1.0.3


### New Features & Enhancements

#### [Issue 3] Clean Formatted Live Logging Engine
- Replaced the messy standard log output with a beautifully formatted live logging engine in [Logger.java](file:///d:/G1axProjects/Mods/G1ax-Crystal-Optimizer-main/G1ax-Crystal-Optimizer-main/src/main/java/dev/akatriggered/util/Logger.java).
- Log lines are structured cleanly (e.g. `[HH:mm:ss] [G1ax/LEVEL] Message`) and written to a dedicated log file at `.minecraft/logs/g1axoptimizer-latest.log`.
- Implemented automatic log rotation that preserves the last 3 log files (`g1axoptimizer-1.log`, `g1axoptimizer-2.log`, `g1axoptimizer-3.log`) to keep log directory clean.

#### [Issue 4] Pre-Flight Compatibility Diagnostics
- Added an automatic check engine in [CompatibilityChecker.java](file:///d:/G1axProjects/Mods/G1ax-Crystal-Optimizer-main/G1ax-Crystal-Optimizer-main/src/main/java/dev/akatriggered/util/CompatibilityChecker.java) that runs on startup.
- Automatically validates Minecraft version, Fabric API, Payload Registry support, Mixin targets, and Java 21+ configuration.
- Generates step-by-step resolution guides in the dedicated log file and triggers an alert in-game if any compatibility issues are found.

#### [Issue 5] AC-Safe Tweak Mode
- Added Tweak Mode configurable via `/g1axoptimizer tweak`.
- Bypasses the 4-tick client-side placement cooldown (`itemUseCooldown = 0`) while keeping the rest of the placement validation and packet logic completely vanilla.
- Safe to use on competitive servers with strict anticheats.

#### [Issue 6] Cross-Version Compatibility Fixes
- Replaced static method and field lookups (such as `MinecraftVersion.CURRENT` and `SharedConstants.getGameVersion().getName()`) with a robust reflection resolver.
- Automatically checks for `getId()`, `getName()`, and `getVersionId()` to run stably across various Minecraft versions without compilation or launch failures.

---

## 🚀 Version 1.0.2

### Bug Fixes

#### [Issue 1] NoSuchMethodError Crash
- Fixed `NoSuchMethodError` when placing crystals on certain Minecraft version environments.
- Replaced manual trigonometry calculations with Minecraft's official `getRotationVec()` method.

#### [Issue 2] Mod Compatibility Crashes
- Added comprehensive crash handlers to prevent conflicts with other crystal mods.
- Verified compatibility with:
  - Client Side Crystals
  - Crystal Anchor Counter
  - Marlow's Crystal Optimizer
  - Safe Crystals
  - Knockback Optimizer
- Added null safety checks and thread-safety protections for asynchronous operations.

---

## 🚀 Version 1.0.1

### Version Update
- Updated mod to target Minecraft 1.21.11+ Fabric environments.
- Updated dependencies to align with modern Fabric API versions.
