# Metrics, Logs and Traces

Distributed systems generate large amounts of operational telemetry continuously.

The three primary observability signals are:
- metrics
- logs
- and traces

Together they help engineers understand distributed-system behavior under production conditions.

---

# Metrics

Metrics help explain why the system reached a particular operational state.

They reveal:
- resource pressure
- saturation
- traffic patterns
- latency trends
- and infrastructure behavior over time

Metrics are useful for:
- monitoring
- alerting
- trend analysis
- and operational health visibility

Metrics detect instability.

---

# Logs

Logs help explain what happened inside workloads and infrastructure components.

They capture:
- events
- errors
- exceptions
- state transitions
- and application behavior

Logs provide localized operational visibility during debugging and failure investigation.

Logs explain local behavior.

---

# Traces

Traces help explain where latency and failure propagated across distributed services.

They reveal:
- request paths
- dependency relationships
- service communication
- and bottlenecks

Traces correlate distributed-system causality.

---

# Why Correlation Matters

Distributed systems rarely fail inside a single component.

Failures propagate across:
- applications
- infrastructure
- networking
- and dependencies

Observability exists to correlate these signals together.

Without correlation:
- telemetry becomes fragmented
- debugging slows
- and operational uncertainty increases

---

# Operational Visibility

Metrics show behavioral changes.

Logs explain component-level events.

Traces connect distributed-system interactions.

Together they reduce uncertainty by helping engineers:
- identify blast radius
- understand propagation behavior
- correlate failures
- and pinpoint instability sources

---

# Key Insight

Metrics detect instability.

Logs explain local behavior.

Traces correlate distributed-system causality.
