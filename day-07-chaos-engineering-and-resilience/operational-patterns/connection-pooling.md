# Connection Pooling

Connection pooling reuses:
- existing database
- or dependency connections

instead of:
- opening new connections repeatedly.

---

# Why Pooling Matters

Without pooling:

Backend pods scale
→ Many new connections created
→ Database overwhelmed
→ Connection exhaustion occurs

---

# Operational Benefits

Pooling reduces:
- connection overhead
- database pressure
- startup amplification
- and latency spikes.

---

# Scaling Challenges

Large-scale recovery events may still create:
- reconnect storms

when:
- many pods recover simultaneously.

---

# Stateful Dependency Protection

Connection pools help stabilize:
- databases
- caches
- and distributed dependencies

during:
- infrastructure instability.

---

# Key Insight

Connection management is critical for protecting stateful dependencies during distributed-system recovery events.
