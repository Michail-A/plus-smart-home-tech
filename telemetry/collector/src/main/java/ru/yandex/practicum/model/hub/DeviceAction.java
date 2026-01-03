package ru.yandex.practicum.model.hub;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class DeviceAction {

    private String sensorId;

    private DeviceActionType type;

    private int value;
}
