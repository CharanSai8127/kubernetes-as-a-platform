# Runaway HPA Scaling

An HPA reacts aggressively to temporary spikes.

Scaling behavior becomes unstable.

Rapid scale-out causes:
- startup storms
- scheduling pressure
- dependency overload

Rapid scale-in causes:
- connection churn
- dropped inflight requests
- instability oscillation

Without stabilization windows, scaling becomes self-amplifying.

Mitigation:
- cooldown windows
- stabilization periods
- resource governance
- controlled scaling policies
