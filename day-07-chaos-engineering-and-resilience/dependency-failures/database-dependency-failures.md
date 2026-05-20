# Database Dependency Failures

Databases are one of the most critical dependencies in distributed systems.

Even small database instability may propagate across:
- APIs
- queues
- caches
- and worker systems.

---

# How Failures Amplify

Example:

Backend pods
→ Database becomes slow
→ Requests remain open
→ Connection pools fill
→ Retries increase
→ Database pressure increases further

---

# Common Causes

Database instability may occur due to:
- connection exhaustion
- slow queries
- replication lag
- storage latency
- or resource contention.

---

# Cascading Effects

Database failures frequently create:
- latency amplification
- retry storms
- queue buildup
- and partial outages.

Applications may appear:
- healthy externally
while:
- dependencies degrade internally.

---

# Operational Reality

Scaling backend pods aggressively may overwhelm:
- stateful database systems.

Especially when:
- many replicas reconnect simultaneously.

---

# Key Insight

Distributed systems often fail because dependencies become overloaded faster than recovery mechanisms converge.
