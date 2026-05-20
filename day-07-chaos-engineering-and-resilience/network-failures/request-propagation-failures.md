# Request Propagation Failures

Modern requests travel through:
- multiple distributed-system layers.

Example request path:

User
→ API Gateway
→ DNS
→ Load Balancer
→ Gateway
→ HTTPRoute
→ Service
→ Endpoints
→ Pod

---

# Why Propagation Matters

Every additional hop introduces:
- latency
- dependency risk
- retries
- and failure probability.

Distributed systems therefore become:
- operational dependency chains.

---

# Failure Amplification

A failure at any layer may impact:
- all upstream requests.

Examples:
- DNS instability
- gateway latency
- endpoint inconsistency
- or backend unavailability.

---

# Operational Consequences

Request propagation failures may create:
- intermittent outages
- latency spikes
- partial traffic loss
- or cascading instability.

---

# Key Insight

Distributed requests fail through dependency propagation across multiple operational layers.
