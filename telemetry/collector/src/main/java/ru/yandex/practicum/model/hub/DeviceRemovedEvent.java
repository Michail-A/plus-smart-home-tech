package ru.yandex.practicum.model.hub;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class DeviceRemovedEvent extends HubEvent{

    private String id;

    @Override
    public HubEventType getType() {
        return HubEventType.DEVICE_REMOVED;
    }
}
