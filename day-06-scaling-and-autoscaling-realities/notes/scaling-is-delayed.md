# Scaling Is Delayed

Distributed systems never scale instantly.

Scaling requires:
- infrastructure provisioning
- pod scheduling
- image pulling
- startup
- readiness checks
- and traffic redistribution.

All of these introduce:
- operational delay.

---

# Temporary Overload Windows

While systems scale:
existing workloads continue serving:
- increasing traffic
- queue pressure
- and dependency load.

This creates temporary instability before:
- scaling converges successfully.

---

# Why Buffers Matter

Systems frequently require:
- spare replicas
- operational headroom
- and safety margins

to survive scaling delays safely.

---

# Key Insight

Scaling decisions happen quickly,
but operational capacity arrives slowly.
