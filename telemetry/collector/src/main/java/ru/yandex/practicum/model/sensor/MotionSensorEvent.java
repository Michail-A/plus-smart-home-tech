package ru.yandex.practicum.model.sensor;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class MotionSensorEvent extends SensorEvent {

    private int linkQuality;

    private Boolean motion;

    private int voltage;

    @Override
    public SensorEventType getType() {
        return SensorEventType.MOTION_SENSOR_EVENT;
    }
}
