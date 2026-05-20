# Failures Are Inevitable

Distributed systems eventually experience:
- infrastructure failures
- dependency instability
- latency spikes
- storage degradation
- and partial outages.

Failure is not:
- an exception.

Failure is:
- a normal operational condition.

---

# Why Failures Occur

Modern systems contain:
- multiple services
- distributed dependencies
- asynchronous communication
- and infrastructure layers.

Every additional dependency introduces:
- operational risk.

---

# Partial Failures

Distributed systems rarely fail:
- completely.

Instead failures become:
- partial
- intermittent
- delayed
- or asymmetric.

Examples:
- some requests succeed
- some fail
- some timeout
- while others remain healthy.

---

# Operational Consequences

Small failures may amplify into:
- retry storms
- cascading failures
- queue saturation
- or dependency collapse.

---

# Key Insight

Production reliability depends on:
- surviving inevitable failures safely.
