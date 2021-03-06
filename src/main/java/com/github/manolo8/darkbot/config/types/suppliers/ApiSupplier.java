package com.github.manolo8.darkbot.config.types.suppliers;

import java.util.Arrays;
import java.util.List;

public class ApiSupplier extends OptionList<Integer> {

    private static final List<String> APIS = Arrays.asList(
            "Darkbot browser (Legacy)",
            "Darkflash API (Legacy)",
            "Darkboat API (Recommended)",
            "NativeAPI (Linux, unreleased)",
            "No-operation API (Testing only)");
    private static final List<String> TOOLTIPS = Arrays.asList(
            "Legacy browser, manual login, by Manolo8",
            "No browser API, auto login, lacks support for new features, by Manolo8",
            "Currently API, no browser, auto login, by Punisher",
            "WIP API, many different implementations by zBlock, wakatoa & Tanoshizo. None publicly released",
            "API that will do nothing. Useful for testing, default if error occurs loading another API. By Popcorn");

    @Override
    public Integer getValue(String text) {
        return Math.max(APIS.indexOf(text), 0);
    }

    @Override
    public String getTooltipFromVal(Integer value) {
        return TOOLTIPS.get(value);
    }

    @Override
    public String getText(Integer value) {
        return APIS.get(value);
    }

    @Override
    public List<String> getOptions() {
        return APIS;
    }

}