# Partial Failure Confusion

Distributed systems rarely fail completely at once.

Most production instability begins as partial failure.

Examples include:
- degraded dependencies
- intermittent latency
- partial request failures
- networking instability
- or overloaded downstream services

These failures are difficult to reason about operationally.

---

# Why Partial Failures Are Dangerous

Partial failures create inconsistent system behavior.

Examples:
- some requests succeed
- some fail
- some timeout
- while infrastructure still appears healthy

This creates operational ambiguity.

---

# Kubernetes Perspective

Kubernetes workloads may remain:
- Running
- Ready
- and available

even while:
- dependencies degrade
- request latency increases
- or downstream systems fail partially

Traditional infrastructure monitoring may miss these conditions entirely.

---

# Observability Importance

Partial failures require:
- telemetry correlation
- request visibility
- operational reasoning
- and distributed-system awareness

Metrics expose:
- latency
- errors
- and saturation

Logs expose:
- local workload behavior

Together they help engineers identify:
- instability sources
- propagation behavior
- and operational degradation

during production failures.

---

# Reliability Impact

Partial failures often create:
- delayed debugging
- hidden instability
- and prolonged outages

Reliable systems require visibility into:
- distributed interactions
- dependency behavior
- and operational state transitions

during failure conditions.

---

# Key Insight

Distributed systems become operationally dangerous when partial failures remain invisible, fragmented, or misunderstood.
