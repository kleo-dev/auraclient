package org.saturnclient.saturnclient.menus;

import org.saturnclient.ui.SaturnUi;
import org.saturnclient.ui.Textures;
import org.saturnclient.ui.animations.FadeIn;
import org.saturnclient.ui.animations.Slide;
import org.saturnclient.ui.widgets.SaturnButton;
import org.saturnclient.ui.widgets.SaturnImageButton;
import org.saturnclient.ui.widgets.SaturnSprite;

import net.minecraft.text.Text;

public class MainMenu extends SaturnUi {
    public MainMenu() {
        super(Text.literal("Saturn Client"));
    }

    @Override
    protected void init() {
        int buttonWidth = 96;
        int buttonHeight = 25;

        draw(
                new SaturnButton("Settings", () -> {
                    client.setScreen(new SettingsMenu());
                }).setX((width - buttonWidth) / 2).setY((height - buttonHeight) /
                        2).setWidth(buttonWidth)
                        .setHeight(buttonHeight)
                        .setAnimations(new FadeIn(3)));

        draw(
                new SaturnImageButton(Textures.EMOTE, 14, 14,
                        () -> {
                            client.setScreen(new SettingsMenu());
                        })
                        .setX((width - buttonWidth - (buttonHeight * 2) - 6) / 2)
                        .setY((height - buttonHeight) / 2)
                        .setWidth(buttonHeight)
                        .setHeight(buttonHeight)
                        .setAnimations(new FadeIn(3)));

        draw(
                new SaturnImageButton(Textures.COSMETICS, 14, 14,
                        () -> {
                            client.setScreen(new SettingsMenu());
                        })
                        .setX((width / 2) + (buttonWidth / 2) + 3)
                        .setY((height - buttonHeight) / 2)
                        .setWidth(buttonHeight)
                        .setHeight(buttonHeight)
                        .setAnimations(new FadeIn(3)));

        int logoSize = 49;

        draw(
                new SaturnSprite(Textures.LOGO_TEXT)
                        .setX((width - logoSize) / 2)
                        .setY((height - 8) / 2 - 23)
                        .setWidth(logoSize)
                        .setHeight(8)
                        .setAnimations(new FadeIn(3)));

        draw(
                new SaturnSprite(Textures.LOGO)
                        .setX((width - logoSize) / 2)
                        .setY(height / 2 - logoSize - 24)
                        .setWidth(logoSize)
                        .setHeight(logoSize)
                        .setAnimations(new Slide(2, 14)));
    }
}