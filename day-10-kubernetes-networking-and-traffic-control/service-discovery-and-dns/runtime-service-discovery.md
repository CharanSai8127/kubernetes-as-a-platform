# Runtime Service Discovery

Distributed systems continuously discover:
- runtime dependencies dynamically.

Kubernetes commonly uses:
- DNS-based service discovery.

---

# Why DNS Matters

Applications depend heavily on:
- stable runtime name resolution.

Failures in DNS may create:
- cascading dependency instability.

---

# CoreDNS

Kubernetes commonly uses:
- CoreDNS
for:
- internal service discovery.

---

# Operational Risks

DNS instability may create:
- failed dependency resolution
- increased latency
- retry amplification
- and runtime failures.

---

# Platform Engineering Perspective

Service discovery reliability directly impacts:
- runtime communication survivability.

---

# Key Insight

Distributed systems depend heavily on stable runtime name resolution.
