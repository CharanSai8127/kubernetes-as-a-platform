# Dependency Collapse

Dependency collapse occurs when:
- unstable downstream systems
can no longer handle:
- amplified operational pressure.

---

# Collapse Flow

Dependency latency increases
→ Requests remain open
→ Retries amplify traffic
→ Queues grow
→ Connections accumulate
→ Dependency saturation worsens
→ System collapses further

---

# Why This Happens

Distributed systems are:
- tightly connected through dependency chains.

Small failures may therefore:
- propagate rapidly across services.

---

# Partial Failure Reality

Dependency collapse frequently appears as:
- intermittent failures
- partial outages
- or inconsistent latency

before:
- complete service disruption occurs.

---

# Recovery Challenges

Collapsed dependencies often continue receiving:
- retry traffic
- reconnect attempts
- and amplified workload pressure.

---

# Key Insight

Distributed systems frequently fail gradually through dependency amplification instead of instant catastrophic failure.
