# External API Instability

Modern systems frequently depend on:
- third-party APIs
- cloud services
- payment providers
- and external integrations.

These dependencies introduce:
- operational uncertainty outside platform control.

---

# Failure Flow

External API latency increases
→ Requests remain pending
→ Application threads block
→ Retries increase
→ Timeouts accumulate
→ User-facing latency increases

---

# Why External Failures Are Dangerous

Infrastructure may appear:
- healthy internally

while:
- external dependencies silently degrade service behavior.

---

# Operational Consequences

External dependency failures may create:
- retry storms
- cascading latency
- queue buildup
- and partial outages.

---

# Recovery Difficulty

External systems cannot be controlled directly.

Applications therefore require:
- resilience patterns
- graceful degradation
- and failure isolation.

---

# Key Insight

Healthy infrastructure does not guarantee healthy distributed-system behavior when external dependencies fail.
