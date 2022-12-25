package com.github.simiacryptus.aicoder.config;

import com.intellij.ui.components.JBTextField;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class AppSettingsComponent extends SimpleSettingsComponent<AppSettingsState> {
    @Name("API Base")
    public final JBTextField apiBase = new JBTextField();
    @Name("API Key")
    public final JBTextField apiKey = new JBTextField();
    @Name("Model")
    public final JBTextField model = new JBTextField();
    @Name("Max Tokens")
    public final JBTextField maxTokens = new JBTextField();
    @Name("History Limit")
    public final JBTextField historyLimit = new JBTextField();
    @Name("Temperature")
    public final JBTextField temperature = new JBTextField();
    @Name("Style")
    public final JBTextField style = new JBTextField();
    @Name("Human Language")
    public final JBTextField humanLanguage = new JBTextField();
    @Name("Max Prompt (Characters)")
    public final JBTextField maxPrompt = new JBTextField();

    public @NotNull JComponent getPreferredFocusedComponent() {
        return apiKey;
    }

}