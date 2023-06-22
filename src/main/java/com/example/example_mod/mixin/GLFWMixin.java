package com.example.example_mod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import org.lwjgl.glfw.GLFW;

@Mixin(GLFW.class)
public class GLFWMixin {

	@Inject(method = "<clinit>", at = @At("TAIL"))
	private static void exampleMod$onInit(CallbackInfo ci) {
		System.out.println("Hello from the GLFW class!");
	}
}
