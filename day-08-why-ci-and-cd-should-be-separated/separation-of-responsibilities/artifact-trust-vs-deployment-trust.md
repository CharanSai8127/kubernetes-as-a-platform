# Artifact Trust Vs Deployment Trust

Artifact trust and deployment trust are:
- different operational concerns.

Both require:
- independent validation.

---

# Artifact Trust

CI establishes whether:
- generated artifacts
are:
- testable
- validated
- and security-scanned.

This includes:
- code quality
- vulnerability checks
- and dependency validation.

---

# Deployment Trust

CD establishes whether:
- deployments behave safely operationally.

This includes:
- rollout behavior
- rollback safety
- environment promotion
- and deployment observability.

---

# Why Separation Matters

A trusted artifact may still create:
- dangerous deployments
during:
- production rollout.

Examples:
- startup storms
- dependency overload
- or failed migrations.

---

# Operational Reliability

Separating both concerns improves:
- deployment governance
- operational visibility
- and rollback safety.

---

# Key Insight

Validated artifacts still require controlled deployment behavior before production rollout.
