package twilightforest.client;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.components.MultiLineLabel;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import twilightforest.TwilightForestMod;

public class OptifineWarningScreen extends Screen {

	private final Screen lastScreen;
	private int ticksUntilEnable = 20 * 3;
	private MultiLineLabel message = MultiLineLabel.EMPTY;
	private static final ITextComponent message = new TranslationTextComponent(TwilightForestMod.ID + ".gui.optifine.message");

	protected OptifineWarningScreen(Screen screen) {
		super(new TranslationTextComponent(TwilightForestMod.ID + ".gui.optifine.title"));
		this.lastScreen = screen;
	}

	public String getNarrationMessage() {
		return super.getNarrationMessage() + ". " + message.getString();
	}

	protected void init() {
		super.init();
		this.addButton(new Button(this.width / 2 - 75, this.height * 3 / 4, 150, 20, DialogTexts.GUI_PROCEED, (p_213002_1_) -> Minecraft.getInstance().setScreen(lastScreen)));
		this.message = IBidiRenderer.create(this.font, message, this.width - 50);
	}

	public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(matrixStack);
		drawCenteredString(matrixStack, this.font, this.title, this.width / 2, 30, 16777215);
		this.message.renderCentered(matrixStack, this.width / 2, 70);
		super.render(matrixStack, mouseX, mouseY, partialTicks);
	}

	public void tick() {
		super.tick();
		if (--this.ticksUntilEnable == 0) {
			for(Widget widget : this.buttons) {
				widget.active = true;
			}
		}
	}

	public boolean shouldCloseOnEsc() {
		return false;
	}
}
