# Circuit Breakers

Circuit breakers protect distributed systems from:
- unstable dependencies.

When a dependency becomes unhealthy:
- requests are temporarily blocked.

---

# Failure Flow

Dependency latency increases
→ Requests fail repeatedly
→ Circuit breaker opens
→ Traffic temporarily stopped
→ Dependency allowed to recover

---

# Why Circuit Breakers Matter

Without protection:
- unstable systems continue receiving traffic,
causing:
- cascading failures
- retry amplification
- and dependency collapse.

---

# Graceful Degradation

Circuit breakers allow applications to:
- fail predictably
instead of:
- collapsing completely.

Examples:
- fallback responses
- cached data
- or temporary service reduction.

---

# Operational Benefits

Circuit breakers reduce:
- dependency pressure
- latency amplification
- and blast radius.

---

# Key Insight

Resilient systems isolate unstable dependencies before failures spread across the platform.
