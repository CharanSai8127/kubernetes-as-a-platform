# Continuous Delivery Vs Continuous Deployment

Continuous Delivery and Continuous Deployment are:
- related
but:
- operationally different.

---

# Continuous Delivery

Continuous Delivery ensures:
- applications are always deployable safely.

Deployments may still require:
- approval
- review
- or controlled promotion.

---

# Continuous Deployment

Continuous Deployment automatically pushes:
- every validated change
directly into:
- production environments.

---

# Operational Risks

Fully automated production deployment may increase:
- blast radius
- rollout risk
- and operational instability.

Especially in:
- large-scale distributed systems.

---

# Platform Engineering Preference

Many production systems prefer:
- controlled Continuous Delivery

instead of:
- unrestricted Continuous Deployment.

---

# Key Insight

Production deployment safety frequently requires operational control beyond artifact validation.
