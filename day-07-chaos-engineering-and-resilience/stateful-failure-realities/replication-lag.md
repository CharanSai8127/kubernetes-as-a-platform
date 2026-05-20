# Replication Lag

Replication lag occurs when:
- replicas cannot synchronize updates fast enough.

This creates:
- delayed consistency across distributed replicas.

---

# Common Causes

Replication lag may occur due to:
- high write pressure
- network latency
- storage bottlenecks
- or overloaded replicas.

---

# Operational Risks

Lagging replicas may produce:
- stale reads
- delayed failover
- inconsistent responses
- and synchronization instability.

---

# Recovery Pressure

During failover:
- lagging replicas may require:
  - additional synchronization
  - replay
  - or state reconciliation.

This increases:
- recovery delay.

---

# Scaling Challenges

Aggressive scale-out may amplify:
- replication traffic
- synchronization overhead
- and storage pressure.

---

# Key Insight

Distributed consistency becomes harder as stateful systems scale under pressure.
