# Bug Fix Release

## Fixed Issues

### Report 1 - NoSuchMethodError Crash
- Fixed `NoSuchMethodError` when placing crystals
- Replaced manual trigonometry calculations with Minecraft's built-in `getRotationVec()` method
- Now compatible with all Minecraft 1.21.1+ versions

### Report 2 - Mod Compatibility Crashes
- Added comprehensive crash handlers to prevent conflicts with other crystal mods
- Now compatible with:
  - Client Side Crystals
  - Crystal Anchor Counter
  - Marlow's Crystal Optimizer
  - Safe Crystals
  - Knockback Optimizer
- Added null checks throughout the codebase
- Added thread-safety protections for async operations

## Changes
- All crystal placement and breaking operations now have exception handling
- Improved stability when used alongside other PvP mods
- Better error recovery during world/dimension changes

Thanks to the community for reporting these issues!
