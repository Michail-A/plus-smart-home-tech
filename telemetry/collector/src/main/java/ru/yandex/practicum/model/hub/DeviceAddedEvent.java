package ru.yandex.practicum.model.hub;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class DeviceAddedEvent extends HubEvent{

    private String id;

    private DeviceType deviceType;

    @Override
    public HubEventType getType() {
        return HubEventType.DEVICE_ADDED;
    }
}
