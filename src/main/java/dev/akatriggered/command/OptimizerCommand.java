package dev.akatriggered.command;

import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class OptimizerCommand {

    public static boolean fastCrystal = true;
    public static boolean crystalOptimizer = true;

    public void initializeCommands() {
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
            // Main toggle command (from mod2 - g1axoptimizer as specified)
            dispatcher.register(ClientCommandManager.literal("g1axoptimizer").executes(context -> {
                if (fastCrystal) {
                    fastCrystal = false;
                    displayMessage("G1ax Fast Crystal disabled!");
                } else {
                    fastCrystal = true;
                    displayMessage("G1ax Fast Crystal enabled!");
                }
                return 1;
            }));

            // Crystal optimizer toggle (from mod1 functionality)
            dispatcher.register(ClientCommandManager.literal("crystaloptimizer").executes(context -> {
                if (crystalOptimizer) {
                    crystalOptimizer = false;
                    displayMessage("Crystal Optimizer disabled!");
                } else {
                    crystalOptimizer = true;
                    displayMessage("Crystal Optimizer enabled!");
                }
                return 1;
            }));
        });
    }

    public static void displayMessage(String message) {
        if (!inGame()) return;

        MinecraftClient client = MinecraftClient.getInstance();
        if (client.inGameHud != null && client.inGameHud.getChatHud() != null) {
            client.inGameHud.getChatHud().addMessage(Text.of(message));
        }
    }

    public static boolean inGame() {
        MinecraftClient client = MinecraftClient.getInstance();
        return client.player != null && client.getNetworkHandler() != null;
    }
}
