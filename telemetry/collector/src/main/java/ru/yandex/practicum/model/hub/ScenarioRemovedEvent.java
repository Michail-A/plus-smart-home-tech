package ru.yandex.practicum.model.hub;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class ScenarioRemovedEvent extends HubEvent {

    String name;

    public HubEventType getType() {
        return HubEventType.SCENARIO_REMOVED;
    }
}
