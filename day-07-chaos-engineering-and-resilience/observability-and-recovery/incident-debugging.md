# Incident Debugging

Distributed-system incidents are difficult because:
- failures propagate across dependencies.

Symptoms may appear:
- far away from the original failure source.

---

# Common Incident Signals

Examples include:
- latency spikes
- retry storms
- queue buildup
- partial outages
- or intermittent timeouts.

---

# Why Debugging Is Difficult

Failures are frequently:
- partial
- asynchronous
- and intermittent.

This creates:
- misleading operational symptoms.

---

# Operational Correlation

Effective debugging requires correlating:
- metrics
- logs
- traces
- events
- and infrastructure state.

---

# Recovery Importance

Fast debugging improves:
- incident response
- recovery speed
- and operational stability.

---

# Key Insight

Distributed-system debugging focuses on dependency relationships instead of isolated component failures.
