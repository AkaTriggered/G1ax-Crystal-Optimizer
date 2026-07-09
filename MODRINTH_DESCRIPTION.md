# 🔮 G1ax Crystal Optimizer

**The ultimate, high-performance crystal PvP optimization mod for Minecraft 1.21.1+ (Fabric)**

G1ax Crystal Optimizer is a advanced, highly optimized Fabric client mod that improves crystal PvP mechanics with intelligent packet management, dynamic latency adaptation, and client-side enhancements. It comes equipped with safety controls for competitive servers and a diagnostic system to ensure compatibility with other mods.

---

## ⚡ Key Modes

Use the command `/g1axoptimizer <default|tweak|off>` to configure the mod on the fly:

### 🛡️ **`/g1axoptimizer tweak` — AC-Safe Mode**
Designed specifically for servers with strict anticheat constraints (e.g. anti-cheat plugin detection):
- **Bypasses Placement Cooldown**: Resets Minecraft's hardcoded 4-tick (200ms) `itemUseCooldown` to check placement conditions every tick (~50ms).
- **100% Vanilla Logic**: Does not inject custom packets, perform predictive visual removal, or bypass vanilla validation logic. Your placement attempts remain completely vanilla.

### 🚀 **`/g1axoptimizer default` — Full Mode**
Maximum PvP performance for environments where optimizer clients are allowed:
- **Intelligent Packet Optimization**: Dynamically adjusts placement packet injection (1 packet for <50ms ping, 2 packets for >50ms ping).
- **Client-Side Visual Removal**: Instantly removes broken crystals visually, providing zero-delay feedback without waiting for server response packets.
- **Direct Block Interaction**: Bypasses slow default block verification sequences for faster crystal placing.
- **Async Execution**: Performs math and validation in parallel threads, keeping client frame rates fluid and lag-free.

---

## 🔧 Pre-Flight Diagnostics & Logger

Never worry about crashes or incompatible mods:
- **Pre-Flight Checker (`CompatibilityChecker`)**: Checks Minecraft Version, Fabric API status, Mixin targets, and Java 21+ configuration on launch. Warns you in-game and logs detailed step-by-step fix guides if something is wrong.
- **Clean Live Logger (`Logger`)**: Writes cleanly structured logs to `.minecraft/logs/g1axoptimizer-latest.log` with automatic log rotation (keeps the last 3 logs to save space).

---

## 🛠️ Performance Benefits

- **Reduced Delay**: Up to 50% faster placement frequency on high-latency/ping connections.
- **Memory Optimized**: Reduced garbage collection overhead with smart object reuse.
- **Coexistence Guards**: Built-in boundary handlers preventing crashes with other mods. Fully compatible with:
  - *Client Side Crystals*
  - *Crystal Anchor Counter*
  - *Marlow's Crystal Optimizer*
  - *Safe Crystals*
  - *Knackback Optimizer*

---

## 🔧 Installation

1. Install [Fabric Loader](https://fabricmc.net/use/installer/) for Minecraft 1.21.1+
2. Download [Fabric API](https://modrinth.com/mod/fabric-api)
3. Download **G1ax Crystal Optimizer**
4. Place the `.jar` files in your `.minecraft/mods` directory
5. Start Minecraft and dominate crystal PvP!

---

## 📝 Support & License

- **License**: MIT License (Free and Open Source)
- **Bug Reports**: Open an issue at [GitHub Issues](https://github.com/tech-anupam/G1ax-Crystal-Optimizer/issues)
- **Discord Community**: Join our server for fast updates and support at [Discord Support](https://discord.gg/Dcmmg3x7M7)

---

**⚠️ Disclaimer**: This mod is designed for performance enhancement. Always verify and follow the rules of the specific servers you play on.
