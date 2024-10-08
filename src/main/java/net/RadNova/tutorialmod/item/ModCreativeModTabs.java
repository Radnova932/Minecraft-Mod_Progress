package net.RadNova.tutorialmod.item;

import net.RadNova.tutorialmod.TutorialMod;
import net.RadNova.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SPIRESTONE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SPIRESTONE.get());
                        pOutput.accept(ModItems.RAW_SPIRESTONE.get());
                        pOutput.accept(ModBlocks.SPIRESTONE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SPIRESTONE_BLOCK.get());
                        pOutput.accept(ModBlocks.SPIRESTONE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SPIRESTONE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SPIRESTONE_ORE.get());
                        pOutput.accept(ModBlocks.END_SPIRESTONE_ORE.get());


                        pOutput.accept(Items.ELYTRA);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
