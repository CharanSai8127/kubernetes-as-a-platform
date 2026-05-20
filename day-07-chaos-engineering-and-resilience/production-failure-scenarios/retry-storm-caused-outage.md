# Retry Storm Caused Outage

Retries intended for resilience may accidentally create:
- large-scale operational outages.

---

# Failure Flow

Dependency becomes slow
→ Requests timeout
→ Clients retry aggressively
→ Traffic multiplies rapidly
→ Dependency collapses further
→ More requests fail

---

# Why This Is Dangerous

Retries may generate:
- significantly more traffic
than:
- original production workload.

This amplifies:
- dependency instability dramatically.

---

# Operational Consequences

Retry storms may create:
- queue saturation
- connection exhaustion
- thread starvation
- and cascading outages.

---

# Mitigation Strategies

Systems reduce retry amplification using:
- exponential backoff
- circuit breakers
- request limits
- and graceful degradation.

---

# Key Insight

Recovery behavior itself may become a major source of distributed-system instability.
