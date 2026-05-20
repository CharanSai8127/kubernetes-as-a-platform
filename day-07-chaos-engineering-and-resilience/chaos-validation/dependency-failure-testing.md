# Dependency Failure Testing

Dependency chaos testing validates:
- resilience during downstream instability.

Examples include:
- slow databases
- failed caches
- DNS instability
- and unavailable APIs.

---

# Why This Matters

Most distributed failures originate from:
- unstable dependencies.

Applications must:
- degrade gracefully
instead of:
- collapsing completely.

---

# Validation Goals

Dependency testing validates:
- retries
- backoff behavior
- circuit breakers
- queue buffering
- and timeout handling.

---

# Failure Amplification

Without resilience controls:

Dependency slows
→ Requests timeout
→ Retries increase
→ Traffic amplifies
→ Dependency collapses further

---

# Operational Benefits

Dependency chaos testing reveals:
- hidden coupling
- retry amplification
- and operational bottlenecks.

---

# Key Insight

Dependency failures are often more dangerous than infrastructure failures because instability propagates across request chains.
