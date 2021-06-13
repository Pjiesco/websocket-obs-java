package net.twasi.obsremotejava.message.event.general;

import lombok.Getter;
import lombok.ToString;
import net.twasi.obsremotejava.message.event.Event;

@Getter
@ToString(callSuper = true)
public class StudioModeStateChanged extends Event {
    private Data eventData;

    protected StudioModeStateChanged() {
        super(Type.StudioModeStateChanged, Category.General);
    }

    @Getter
    @ToString
    public static class Data {
        private Boolean studioModeEnabled;
    }
}
