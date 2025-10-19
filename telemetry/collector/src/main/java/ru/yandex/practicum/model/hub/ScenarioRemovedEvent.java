package ru.yandex.practicum.model.hub;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ScenarioRemovedEvent extends HubEvent {

    String name;

    public HubEventType getType() {
        return HubEventType.SCENARIO_REMOVED;
    }
}
