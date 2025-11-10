package ru.yandex.practicum.model.hub;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ScenarioCondition {

    private String sensorId;

    private ConditionType type;

    private ConditionOperation operation;

    private Object value;
}
