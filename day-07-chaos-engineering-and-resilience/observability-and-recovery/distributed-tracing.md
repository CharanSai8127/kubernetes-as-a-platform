# Distributed Tracing

Distributed tracing tracks:
- request propagation
across:
- multiple services and dependencies.

---

# Why Tracing Matters

Modern requests travel through:
- gateways
- APIs
- queues
- databases
- and external services.

Failures may occur:
- at any layer.

---

# Operational Visibility

Tracing helps identify:
- latency propagation
- dependency bottlenecks
- retry amplification
- and failing request paths.

---

# Example Request Chain

User
→ Gateway
→ Backend API
→ Cache
→ Database
→ External API

Tracing visualizes:
- the entire operational path.

---

# Failure Analysis

Tracing becomes critical during:
- intermittent failures
- partial outages
- and cascading latency.

---

# Key Insight

Distributed tracing exposes how failures propagate across request dependency chains.
