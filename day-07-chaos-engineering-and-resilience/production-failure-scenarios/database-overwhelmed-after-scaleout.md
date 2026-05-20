# Database Overwhelmed After Scale Out

Scaling stateless applications aggressively may overload:
- stateful database systems.

---

# Failure Flow

Backend replicas scale rapidly
→ New pods connect simultaneously
→ Database connections spike
→ Query pressure increases
→ Database latency grows
→ Requests begin failing

---

# Why This Happens

Stateless scaling increases:
- compute capacity.

But databases scale differently because they require:
- replication
- consistency
- synchronization
- and storage coordination.

---

# Operational Consequences

Systems may experience:
- connection exhaustion
- replication lag
- retry storms
- and dependency collapse.

---

# Mitigation Strategies

Common protections include:
- connection pooling
- queues
- caches
- gradual scaling
- and read replicas.

---

# Key Insight

Scaling stateless layers aggressively may destabilize stateful dependencies unexpectedly.
