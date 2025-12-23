package ru.yandex.practicum.model.sensor;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class TemperatureSensorEvent extends SensorEvent {

    private int temperatureC;

    private int temperatureF;

    @Override
    public SensorEventType getType() {
        return SensorEventType.TEMPERATURE_SENSOR_EVENT;
    }
}
