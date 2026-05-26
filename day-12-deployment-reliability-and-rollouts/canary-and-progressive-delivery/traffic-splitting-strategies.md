# Traffic Splitting Strategies

Traffic splitting controls:
- how requests distribute across application versions.

This enables:
- gradual rollout exposure during deployments.

---

# Why Traffic Splitting Matters

Routing all traffic immediately toward:
- new replicas
introduces:
- large operational risk.

Traffic splitting improves:
- deployment survivability.

---

# Runtime Traffic Coordination

Traffic may gradually shift:
- between stable and new application versions.

Examples include:
- 90/10
- 80/20
- 50/50
- and full cutover.

---

# Operational Benefits

Traffic splitting improves:
- rollout safety
- runtime visibility
- and rollback flexibility.

---

# Platform Engineering Perspective

Traffic-aware routing becomes:
- deployment survivability engineering.

---

# Key Insight

Traffic exposure should evolve gradually during deployments.
